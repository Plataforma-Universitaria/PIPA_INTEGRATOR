package br.ueg.tc.pipa_integrator.interfaces.providers.parameters;

import br.ueg.tc.pipa_integrator.enums.ParameterType;
import br.ueg.tc.pipa_integrator.interfaces.providers.IBaseInstitutionProvider;

public abstract class AParameter {

    public final String getName(){
        return this.getClass().getSimpleName();
    }

    public abstract ParameterType getType();
    public abstract Object getDefaultValue();
    public abstract Object getValueFromInstitution(IBaseInstitutionProvider institution);
    public abstract Object getObjectValue(String value); //para saber o tipo do valor do parametro

}
