import java.repository.dvdrentalRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import javax.validation.constraints.Null;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@Service
public class dvdrentalService
{
    dvdrentalrepository dvdrentalRepository;

    @Autowired
    @Qualifier("sqlJdbcTemplate")
    private JdbcTemplate sqlJdbcTemplate1;

    public List<Map<String, Object>> getBData(String parameterName, String FT, String TT, String Machine)
    {
        try
        {
            List<Map<String, Object>> bData;
            String query;
            if(Machine.equals("All"))
            {
                query = StringUtils.replaceEach(dvdrentalRepository.bQuery_allMachines,
                        new String[]{"actor", "actor", "actor_info"},
                        new String[]{parameterName, FT, TT});
            }
            else
                {
                query = StringUtils.replaceEach(customQueryRepository.bQuery_machineSelection,
                        new String[]{"actor", "actor", "actor_info", "actor_info"},
                        new String[]{parameterName, FT, TT, Machine});

                }
            bData = mariaJdbcTemplate.queryForList(query);
            return bData;
        }
        catch(Exception e)
        {
            System.out.println("Exception thrown");
            throw e;
        }
    }
