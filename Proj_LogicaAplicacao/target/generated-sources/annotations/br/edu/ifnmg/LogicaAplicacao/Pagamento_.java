package br.edu.ifnmg.LogicaAplicacao;

import br.edu.ifnmg.LogicaAplicacao.TipoPagamento;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-08-11T17:27:23", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Pagamento.class)
public class Pagamento_ { 

    public static volatile SingularAttribute<Pagamento, TipoPagamento> tipo;
    public static volatile SingularAttribute<Pagamento, BigDecimal> valorDesconto;
    public static volatile SingularAttribute<Pagamento, BigDecimal> valor;
    public static volatile SingularAttribute<Pagamento, Integer> quantParcelas;
    public static volatile SingularAttribute<Pagamento, Long> id;

}