####Java配置
- Spring 容器类选用： AnnotationConfigApplicationContext
- 使用 @Configuration 注解表明当前类是一个配置类，这意味着这个类里可能有0个到多个@Bean的注解，此处没有用注解，是因为所有的Bean都在此类中定义了。
- 使用 @Bean 注解声明当前方法 FunctionService 的返回值是一个 Bean ， Bean 的名称是方法名称
- 注入 FunctionService 的 Bean 的时候直接调用 functionService()
- 另外一种注入方式是直接将 FunctionService 作为参数传递给 useFunctionService().
- 在 Spring 容器中，只要容器中存在某个Bean ，就可以在另外一个 Bean 的声明方法的参数中注入