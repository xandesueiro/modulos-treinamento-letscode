package br.com.letscode.presenter.interfaces;

import br.com.letscode.estudo.Banco;
import br.com.letscode.presenter.exceptions.PresenterException;

import java.util.Scanner;

public interface Presenter<M, B> {

    void print(Banco banco) throws PresenterException;

}
