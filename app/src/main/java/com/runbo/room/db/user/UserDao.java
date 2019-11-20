package com.runbo.room.db.user;

import android.database.Cursor;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

/**
 * Created by liangcw on 2019/11/19 - 10:01
 */
@Dao
public interface UserDao {
    //查找
    @Query("SELECT * FROM user")
    List<User> getAllUsers();
    @Query("SELECT * FROM user WHERE id=:id")
    User getUser(int id);
    @Query("SELECT * FROM user")
    Cursor getUserCursor();
    @Query("SELECT * FROM user WHERE age=:age")
    List<User> getUsersByAge(int age);
    @Query("SELECT * FROM user WHERE age=:age LIMIT :max")
    List<User> getUsersByAge(int max, int... age);

    //插入
    @Insert
    void insert(User... users);
    @Insert
    void insert(User user);
    @Insert
    void insert(List<User> userLists);

    @Update
    void update(User ...users);

    @Delete
    void delete(User ...users);
}
