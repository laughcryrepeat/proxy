# proxy


### JDK 동적 프록시
- 자바 언어가 기본으로 제공한다.
- JDK 동적 프록시에 적용할 로직은 InvocationHandler 인터페이스를 구현해서 작성
- 인터페이스를 기반으로 프록시를 런타임에 동적으로 만들어준다. 따라서 인터페이스가 필수이다.

![05proxy-1](https://github.com/laughcryrepeat/proxy/assets/45473375/7b34346f-0247-4b7f-9448-913210f3d00c)

![05proxy-2](https://github.com/laughcryrepeat/proxy/assets/45473375/60a8eca9-081a-44d2-9ea0-ae44afb2ae48)



### CGLIB: Code Generator Library
- CGLIB는 바이트코드를 조작해서 동적으로 클래스를 생성하는 기술을 제공하는 라이브러리이다.
- CGLIB를 사용하면 인터페이스가 없어도 구체 클래스만 가지고 동적 프록시를 만들어낼 수 있다.
- CGLIB는 원래는 외부 라이브러리인데, 스프링 프레임워크가 스프링 내부 소스 코드에 포함했다. 따라서
스프링을 사용한다면 별도의 외부 라이브러리를 추가하지 않아도 사용할 수 있다.
- CGLIB는 MethodInterceptor 를 제공한다.


  ![05proxy-3](https://github.com/laughcryrepeat/proxy/assets/45473375/61d4c040-f39b-4cc8-aced-e67a06d0de62)