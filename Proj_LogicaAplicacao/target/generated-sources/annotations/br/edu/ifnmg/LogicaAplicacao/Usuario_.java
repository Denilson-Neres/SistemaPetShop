package br.edu.ifnmg.LogicaAplicacao;

import br.edu.ifnmg.LogicaAplicacao.TipoUsuario;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-10-13T12:39:25", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> senha;
    public static volatile SingularAttribute<Usuario, String> telefone;
    public static volatile SingularAttribute<Usuario, TipoUsuario> tipo;
    public static volatile SingularAttribute<Usuario, String> documento;
    public static volatile SingularAttribute<Usuario, String> nome;
    public static volatile SingularAttribute<Usuario, Long> id;
    public static volatile SingularAttribute<Usuario, String> login;
    public static volatile SingularAttribute<Usuario, Integer> version;

}