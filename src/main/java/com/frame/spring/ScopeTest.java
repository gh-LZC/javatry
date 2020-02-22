package com.frame.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @class ScopeTest
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/1/12 0:15
 * @Version 1.0
 */
@Component
public class ScopeTest  {
    @Component
    @Scope("singleton")
    static class SingletonBean{}
    @Component
    @Scope("prototype")
    static class PrototypeBean{}
    /*@Component
    @Scope("request")
    static class RequsetBean{}
    @Component
    @Scope("session")
    static class SessionBean{}
    @Component
    @Scope("globalSession")
    static class GlobalSessiontBean{}*/
}
