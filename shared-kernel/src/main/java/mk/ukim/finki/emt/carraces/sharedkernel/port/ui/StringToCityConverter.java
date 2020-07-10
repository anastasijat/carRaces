package mk.ukim.finki.emt.carraces.sharedkernel.port.ui;

import mk.ukim.finki.emt.carraces.sharedkernel.domain.City;
import com.vaadin.flow.data.binder.Result;
import com.vaadin.flow.data.binder.ValueContext;
import com.vaadin.flow.data.converter.Converter;


public class StringToCityConverter implements Converter<String, City> {

    @Override
    public Result<City> convertToModel(String s, ValueContext valueContext) {
        return s==null? Result.ok(null):Result.ok(new City(s));
    }

    @Override
    public String convertToPresentation(City city, ValueContext valueContext) {
        return city==null?"":city.toString();
    }
}
