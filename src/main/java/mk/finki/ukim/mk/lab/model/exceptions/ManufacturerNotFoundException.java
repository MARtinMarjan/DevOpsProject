package mk.finki.ukim.mk.lab.model.exceptions;

public class ManufacturerNotFoundException extends RuntimeException{
    public ManufacturerNotFoundException(Long id){
        super(String.format("Manufacturer with id %d is not in our DB",id));
    }
}
