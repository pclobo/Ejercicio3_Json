public class TipoListado {
    private String site_id;
    private String id;
    private String name;


    public TipoListado(String site_id, String id, String name) {
        this.site_id = site_id;
        this.name = name;
        this.id = id;
    }


    public String getSite_id() {
        return site_id;
    }

    public void setSite_id(String site_id) {
        this.site_id = site_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return "Site_id=" + site_id + "\nID=" + id + "\nName=" + name+"\n";
    }
}
