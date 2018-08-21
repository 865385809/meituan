package com.controller;

/**
 * Created by acer on 2018/8/20.
 */
import java.io.IOException;
import java.util.List;

import com.bean.City;
import com.bean.Country;
import com.bean.Provinced;
import com.service.CityService;
import com.service.CountryService;
import com.service.ProvincedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/comovementController")
public class ComovementController {
    @Autowired
    ProvincedService provincedService;
    @Autowired
    CityService cityService;
    @Autowired
    CountryService countryService;

    @RequestMapping("/findProvince")
    @ResponseBody
    public Object findProvince(Model model) {
        List<Provinced> provinced=provincedService.findProvinced();
        System.out.println("###provinced" + provinced);
        //model.addAttribute("provinced",provinced);
        return provinced;
    }
    @RequestMapping(value="/findCity/{prId}")
    @ResponseBody
    public Object testJson1( @PathVariable("prId") String prId,Model model) throws IOException{
        System.out.println("$$$$$prId" + prId);
        List<City> city=cityService.findCityById(prId);
        return city;
    }
    @RequestMapping(value="/findCountry/{ciId}")
    @ResponseBody
    public Object testJson2(@PathVariable("ciId") String ciId,Model model) throws IOException{
        System.out.println("ciId" + ciId);
        List<Country> country=countryService.findCountryByName(ciId);
        return country;
    }
}
