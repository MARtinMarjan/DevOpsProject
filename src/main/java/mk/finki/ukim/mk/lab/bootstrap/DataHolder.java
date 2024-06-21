package mk.finki.ukim.mk.lab.bootstrap;

import lombok.Getter;
import mk.finki.ukim.mk.lab.model.Balloon;
import mk.finki.ukim.mk.lab.model.Manufacturer;
import mk.finki.ukim.mk.lab.model.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@Component
@Getter
public class DataHolder {


    //public static List<Balloon> category = new ArrayList<>();
    public static List<Manufacturer> manufacturers = new ArrayList<>();
    public static List<Balloon> balloons = new ArrayList<>();

    public static List<Order> orders = new ArrayList<>();

   /* @PostConstruct
    public void init(){

      *//*  category.add(new Balloon("Blooon,"Sharen"));
        category.add(new Balloon("Blooon","Sharen"));
        category.add(new Balloon("Blooon","Sharen"));
        category.add(new Balloon("Blooon","Sharen"));
        category.add(new Balloon("Blooon","Sharen"));
        category.add(new Balloon("Blooon","Sharen"));
        category.add(new Balloon("Blooon","Sharen"));
        category.add(new Balloon("Blooon","Sharen"));
        category.add(new Balloon("Blooon","Sharen"));
        category.add(new Balloon("Blooon","Sharen"));*//*

        Manufacturer manufacturer = new Manufacturer("Cameroon","USA","Texas");
        manufacturers.add(manufacturer);
        Manufacturer manufacturer1 = new Manufacturer("Teteks","MKD","Tetovo");
        manufacturers.add(manufacturer1);
        Manufacturer manufacturer2 = new Manufacturer("MK Ballons","MKD","Skopje");
        manufacturers.add(manufacturer2);
        balloons.add(new Balloon("bloon","Sharen",manufacturer));
        balloons.add(new Balloon("bloon1","Sharen",manufacturer1));
        balloons.add(new Balloon("bloon2","Sharen",manufacturer2));
        balloons.add(new Balloon("bloon","Sharen",manufacturer));
        balloons.add(new Balloon("bloon1","Sharen",manufacturer2));
        balloons.add(new Balloon("bloon2","Sharen",manufacturer1));
        balloons.add(new Balloon("bloon","Sharen",manufacturer));
        balloons.add(new Balloon("bloon1","Sharen",manufacturer2));
        balloons.add(new Balloon("bloon2","Sharen",manufacturer1));
        balloons.add(new Balloon("bloon","Sharen",manufacturer));
    }*/

}
