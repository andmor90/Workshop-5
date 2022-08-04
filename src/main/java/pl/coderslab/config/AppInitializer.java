package pl.coderslab.config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


//public class AppInitializer implements WebApplicationInitializer {
//    @Override
//    public void onStartup(ServletContext container) throws ServletException {
//        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        ctx.register(AppConfig.class);
//        ctx.setServletContext(container);
//        ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet(ctx));
//        servlet.setLoadOnStartup(1);
//        servlet.addMapping("/");
//
//        FilterRegistration.Dynamic fr = container.addFilter("encodingFilter", new CharacterEncodingFilter());
//        fr.setInitParameter("encoding", "UTF-8");
//        fr.setInitParameter("forceEncoding", "true");
//        fr.addMappingForUrlPatterns(null, true, "/*");
//    }
public class AppInitializer extends
        AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}




