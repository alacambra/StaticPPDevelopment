package com.poolingpeople.staticcdi;

import org.hibernate.validator.internal.engine.ValidatorImpl;

import javax.validation.ConstraintViolation;
import javax.validation.ValidationException;
import javax.validation.Validator;
import javax.validation.executable.ExecutableValidator;
import javax.validation.metadata.BeanDescriptor;
import java.util.Set;

/**
 * Created by alacambra on 03.12.14.
 */
public class DummyValidator implements Validator {

    public BeanDescriptor getConstraintsForClass(Class<?> clazz)
    {
        // TODO Auto-generated method stub
        return null;
    }

    public <T> T unwrap(Class<T> type)
    {
        if (type.equals(Validator.class))
        {
            return type.cast(this);
        }
        else
        {
            throw new ValidationException();
        }
    }

    @Override
    public ExecutableValidator forExecutables() {
        return null;
    }

    public <T> Set<ConstraintViolation<T>> validate(T object, Class<?>... groups)
    {
        // TODO Auto-generated method stub
        return null;
    }

    public <T> Set<ConstraintViolation<T>> validateProperty(T object, String propertyName, Class<?>... groups)
    {
        // TODO Auto-generated method stub
        return null;
    }

    public <T> Set<ConstraintViolation<T>> validateValue(Class<T> beanType, String propertyName, Object value, Class<?>... groups)
    {
        // TODO Auto-generated method stub
        return null;
    }
}
