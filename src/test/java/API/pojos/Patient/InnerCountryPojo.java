package API.pojos.Patient;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class InnerCountryPojo {




        private Integer id;
        private String name;

        @Override
        public String toString() {
            return "MedunnaInnerCountryPojo{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public InnerCountryPojo(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public InnerCountryPojo() {
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    /*
    {
        "id": 80065,
        "name": "USA"
    }
     */
    }

