package br.edu.ifnmg.LogicaAplicacao;

import br.edu.ifnmg.LogicaAplicacao.Cliente;
import br.edu.ifnmg.LogicaAplicacao.OrdemServicoItens;
import br.edu.ifnmg.LogicaAplicacao.Pagamento;
import br.edu.ifnmg.LogicaAplicacao.StatusOS;
import br.edu.ifnmg.LogicaAplicacao.Usuario;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-08-11T17:27:23", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(OrdemServico.class)
public class OrdemServico_ { 

    public static volatile SingularAttribute<OrdemServico, Cliente> cliente;
    public static volatile ListAttribute<OrdemServico, OrdemServicoItens> itens;
    public static volatile SingularAttribute<OrdemServico, Date> data;
    public static volatile SingularAttribute<OrdemServico, BigDecimal> valorTotal;
    public static volatile SingularAttribute<OrdemServico, Usuario> usuario;
    public static volatile SingularAttribute<OrdemServico, Long> id;
    public static volatile SingularAttribute<OrdemServico, Pagamento> pagamento;
    public static volatile SingularAttribute<OrdemServico, Integer> version;
    public static volatile SingularAttribute<OrdemServico, StatusOS> status;

}