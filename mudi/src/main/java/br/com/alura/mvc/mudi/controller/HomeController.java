package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Galaxy Tab a 8");
        pedido.setUrlImagem("https://m.media-amazon.com/images/I/51KnBx-LkLL._AC_SL1000_.jpg");
        pedido.setUrlProduto("https://www.amazon.com.br/Galaxy-T295-32GB-Mem%C3%B3ria-Interna/dp/B082VXD92L/ref=sr_1_19?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&dchild=1&keywords=tablet&qid=1635338482&sr=8-19&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147");
        pedido.setDescricao("Descrição do pedido");

        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos", pedidos);

        return "home";
    }
}
