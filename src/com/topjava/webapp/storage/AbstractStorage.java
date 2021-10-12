package com.topjava.webapp.storage;

import com.topjava.webapp.exception.ExistStorageException;
import com.topjava.webapp.exception.NotExistStorageException;
import com.topjava.webapp.model.Resume;

public abstract class AbstractStorage implements Storage{

    protected abstract int getSearchKey(String uuid);

    protected abstract boolean isExist(Object searchKey);

    protected abstract void doUpdate(Resume r, Object searchKey);

    protected abstract void doSave(Resume r, Object searchKey);

    protected abstract void doDelete(Object searchKey);

    protected abstract Resume doGet(Object searchKey);

    public void update(Resume r) {
        Object searchKey = getSearchKey(r.getUuid());
        if (!isExist(searchKey)) {
            throw new NotExistStorageException(r.getUuid());
        } else {
            doUpdate(r, searchKey);
        }
    }

    public void save(Resume r) {
        Object searchKey = getSearchKey(r.getUuid());
        if (isExist(searchKey)) {
            throw new ExistStorageException(r.getUuid());
        } else {
            doSave(r, searchKey);
        }
    }

    public void delete(String uuid) {
        Object searchKey = getSearchKey(uuid);
        if (!isExist(searchKey)) {
            throw new NotExistStorageException(uuid);
        } else {
            doDelete(searchKey);
        }
    }

    public Resume get(String uuid) {
        Object searchKey = getSearchKey(uuid);
        if (!isExist(searchKey)) {
            throw new NotExistStorageException(uuid);
        }
        return doGet(searchKey);
    }

}
