package Repositorio;

import java.util.HashMap;

public abstract class BaseRepositorio <TFakedb, TDominio>{

    protected TFakedb fakedb;
    protected HashMap<Long, TDominio> dados;
}
