package pl.madison.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.madison.domain.Liczby;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {

    private List<Integer> listaLiczb = new ArrayList<Integer>();

    @RequestMapping(value = "/uzupelnijLiczby")
    public String uzupelnij(Map<String, Object> model){
        model.put("uzup", new Liczby());

        return "uzupelnianieLiczb";
    }

    @RequestMapping(value = "/najwieksza", method = RequestMethod.POST)
    public String najwiekszaZnajdz(Liczby liczby, Map<String, Object> model){

        listaLiczb.add(liczby.getLiczba3());
        listaLiczb.add(liczby.getLiczba2());
        listaLiczb.add(liczby.getLiczba1());
        int liczbaPomocnicza = listaLiczb.get(0);
        for(Integer i : listaLiczb){
            if(i>liczbaPomocnicza){
                liczbaPomocnicza=i;
            }
        }

        model.put("znajdz", liczbaPomocnicza);
        return "najwieksza";


    }

}
