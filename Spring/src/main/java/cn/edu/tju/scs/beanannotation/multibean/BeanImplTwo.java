package cn.edu.tju.scs.beanannotation.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)  //@Order(value=1)
@Component
public class BeanImplTwo implements BeanInterface {

}
