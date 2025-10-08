package br.ueg.tc.pipa_integrator.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ServiceProviderMethod {
    public boolean manipulatesData() default false;
    public String[] activationPhrases();
    public String actionName();
    public String[] addSpec() default "";

}
