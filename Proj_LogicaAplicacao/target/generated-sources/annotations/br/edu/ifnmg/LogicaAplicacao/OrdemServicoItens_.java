package br.edu.ifnmg.LogicaAplicacao;

import br.edu.ifnmg.LogicaAplicacao.Animal;
import br.edu.ifnmg.LogicaAplicacao.OrdemServico;
import br.edu.ifnmg.LogicaAplicacao.Servico;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-10-13T12:39:25", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(OrdemServicoItens.class)
public class OrdemServicoItens_ { 

    public static volatile SingularAttribute<OrdemServicoItens, BigDecimal> valor;
    public static volatile SingularAttribute<OrdemServicoItens, Animal> animal;
    public static volatile SingularAttribute<OrdemServicoItens, OrdemServico> ordemServico;
    public static volatile SingularAttribute<OrdemServicoItens, Servico> servico;

}