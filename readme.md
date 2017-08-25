####基于注解拦截 和 基于方法规则拦截： 模拟记录操作的日志系统的实现

注 ： 注解式拦截能够很好的控制要拦截的粒度和获得更丰富的信息，Spring 本身在 事物处理（@Transcational） 和 数据缓存（@Cacheable等）上面都使用此种形式的拦截

- Spring 容器类选用： AnnotationConfigApplicationContext
- AOP 面向切面编程 

Spring的AOP的存在是为了解耦，AOP可以让一组类共享相同的行为。
- OOP 面向对象编程

OOP 只能通过继承和实现接口，来使代码耦合性增强，而且类继承只能为单继承，阻碍了更多行为添加到一组类上，AOP弥补了OOP的缺点。


- Spring 支持 AspectJ的注解式编程
1. 使用 @Aspect 声明是一个切面
2. 使用 @After @Brfore @Around 定义建言（advice），可直接将拦截规则（切点）作为参数

- 本例实现过程
1. 添加 Spring aop 支持 AspectJ 依赖
spring-aop
aspectjrt
aspectjweaver
2. 编写拦截规则的注解
注解：注解本身没有功能，和xml一样。注解和xml都是一种元数据，元数据：即解释数据的数据，这就是所谓的配置。注解的功能来自于使用这个注解的地方。
3. 编写使用注解的被拦截类
4. 编写使用方法规则被拦截类
5. 编写切面
6. 编写配置类
7. 运行

 
 