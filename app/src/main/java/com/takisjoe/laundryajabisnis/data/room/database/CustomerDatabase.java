package com.takisjoe.laundryajabisnis.data.room.database;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.takisjoe.laundryajabisnis.data.room.dao.CustomerDao;
import com.takisjoe.laundryajabisnis.domain.customer.entity.Customer;

@Database(entities = {Customer.class}, version = 1, exportSchema = false)
public abstract class CustomerDatabase extends RoomDatabase {
    private static CustomerDatabase instance;

    public abstract CustomerDao customerDao();

    public static synchronized CustomerDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                            CustomerDatabase.class, "room_database")
                    .fallbackToDestructiveMigration()
                    .addCallback(callback)
                    .build();
        }
        return instance;
    }

    private static final RoomDatabase.Callback callback = new RoomDatabase.Callback(){
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDbAsynTask(instance).execute();
        }
    };

    private static class PopulateDbAsynTask extends AsyncTask<Void, Void, Void> {
        private final CustomerDao customerDao;

        public PopulateDbAsynTask(@NonNull CustomerDatabase db){
            customerDao = db.customerDao();
        }

        @Nullable
        @Override
        protected Void doInBackground(Void... voids) {
            for (int i = 0; i < 10; i++) {
                Customer customer = new Customer();
                customer.setIdCustomer("id"+i);
                customer.setNameCustomer("Nama");

                customerDao.insert(new Customer());
            }
            return null;
        }
    }

}
