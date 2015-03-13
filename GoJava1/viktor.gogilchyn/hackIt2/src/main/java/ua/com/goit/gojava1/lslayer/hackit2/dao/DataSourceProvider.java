package ua.com.goit.gojava1.lslayer.hackit2.dao;



import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DataSourceProvider {

    @Bean
    public DataSource getDataSource() {
            InitialContext cxt;
            DataSource ds = null;
            try {
                cxt = new InitialContext();
                ds = (DataSource) cxt.lookup("java:/comp/env/jdbc/postgresDS");
            } catch (NamingException e) {
                e.printStackTrace();
            }
            return ds;
        }
    
    
    
}