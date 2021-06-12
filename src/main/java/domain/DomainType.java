package domain;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.List;

public interface DomainType extends Serializable{
    
    
    String getTableName();

    String getColumnNamesForInsert();

    String getInsertValues();

    
    void setId(Long id);

    String getJoinCondition();
    
    String getUpdateString(DomainType d);
    
    List<DomainType> getRS(ResultSet rs);
    
    String getDeleteString();
            
}
