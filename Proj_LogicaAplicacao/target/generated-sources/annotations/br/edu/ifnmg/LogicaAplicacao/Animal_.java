package br.edu.ifnmg.LogicaAplicacao;

import br.edu.ifnmg.LogicaAplicacao.Cliente;
import br.edu.ifnmg.LogicaAplicacao.Raca;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-10-13T12:39:25", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Animal.class)
public class Animal_ { 

    public static volatile SingularAttribute<Animal, Cliente> cliente;
    public static volatile SingularAttribute<Animal, String> observacoes;
    public static volatile SingularAttribute<Animal, Raca> raca;
    public static volatile SingularAttribute<Animal, String> nome;
    public static volatile SingularAttribute<Animal, Long> id;
    public static volatile SingularAttribute<Animal, String> sexo;
    public static volatile SingularAttribute<Animal, Integer> versao;

}