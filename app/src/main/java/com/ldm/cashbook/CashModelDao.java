package com.ldm.cashbook;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.ldm.cashbook.model.CashModel;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CASH_MODEL".
*/
public class CashModelDao extends AbstractDao<CashModel, Long> {

    public static final String TABLENAME = "CASH_MODEL";

    /**
     * Properties of entity CashModel.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property CostName = new Property(1, String.class, "costName", false, "costName");
        public final static Property CostTime = new Property(2, String.class, "costTime", false, "costTime");
        public final static Property CostNumber = new Property(3, String.class, "costNumber", false, "costNumber");
    }


    public CashModelDao(DaoConfig config) {
        super(config);
    }
    
    public CashModelDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CASH_MODEL\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"costName\" TEXT," + // 1: costName
                "\"costTime\" TEXT," + // 2: costTime
                "\"costNumber\" TEXT);"); // 3: costNumber
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CASH_MODEL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, CashModel entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String costName = entity.getCostName();
        if (costName != null) {
            stmt.bindString(2, costName);
        }
 
        String costTime = entity.getCostTime();
        if (costTime != null) {
            stmt.bindString(3, costTime);
        }
 
        String costNumber = entity.getCostNumber();
        if (costNumber != null) {
            stmt.bindString(4, costNumber);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, CashModel entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String costName = entity.getCostName();
        if (costName != null) {
            stmt.bindString(2, costName);
        }
 
        String costTime = entity.getCostTime();
        if (costTime != null) {
            stmt.bindString(3, costTime);
        }
 
        String costNumber = entity.getCostNumber();
        if (costNumber != null) {
            stmt.bindString(4, costNumber);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public CashModel readEntity(Cursor cursor, int offset) {
        CashModel entity = new CashModel( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // costName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // costTime
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // costNumber
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, CashModel entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setCostName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCostTime(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setCostNumber(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(CashModel entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(CashModel entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(CashModel entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}