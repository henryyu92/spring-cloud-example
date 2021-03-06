package example.container.context;

import example.container.definition.ExBeanDefinitionReader;
import example.resource.ExtResource;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * BeanFactory Initializer
 */
public class ExtBeanFactoryInitializer {

    public void initialize(){

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        ExBeanDefinitionReader reader = new ExBeanDefinitionReader(beanFactory);

        reader.loadBeanDefinitions(new ExtResource());

    }
}
