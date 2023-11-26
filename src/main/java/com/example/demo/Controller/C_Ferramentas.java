package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class C_Ferramentas {

    @GetMapping("/")
    public String getTeste() {
        return "teste";
    }
    @GetMapping("/carteira")
    public String getCarteira() {
        return "carteira";
    }
    @GetMapping("/tabelacliente")
    public String gettabela() {
        return "tabela";
    }
    @GetMapping("/perfil")
    public String getPerfil() {
        return "perfil";
    }
    @GetMapping("/consultor")
    public String getConsultor() {
        return "inicio_cons";
    }
    @GetMapping("/chat")
    public String getChat() {
        return "chat";
    }
    @GetMapping("/investimentos")
    public String getInvest() {
        return "investimentos";
    }
    @GetMapping("/calculadora")
    public String getCalculadora() {
        return "calculadora";
    }
    @GetMapping("/inicio")
    public String getinicio() {
        return "inicioyas";
    }
}

