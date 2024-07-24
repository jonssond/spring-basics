package com.newgo.diogo.vendas.service;

import com.newgo.diogo.vendas.model.Cliente;
import com.newgo.diogo.vendas.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    private ClientesRepository repository;

    @Autowired
    public ClientesService(ClientesRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        if (validarCliente(cliente)) {
            this.repository.salvar(cliente);
        };

    }

    public boolean validarCliente(Cliente cliente){
        //aplicar validações
        return true;
    }
}
