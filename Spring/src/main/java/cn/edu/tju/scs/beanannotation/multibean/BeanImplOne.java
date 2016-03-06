package cn.edu.tju.scs.beanannotation.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2) //@Order(value=2)
@Component
public class BeanImplOne implements BeanInterface {

}
