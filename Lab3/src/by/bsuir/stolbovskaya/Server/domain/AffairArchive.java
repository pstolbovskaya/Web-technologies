package by.bsuir.stolbovskaya.Server.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

@XmlRootElement(name = "affairs")
@XmlAccessorType(XmlAccessType.FIELD)
public class AffairArchive implements Serializable {

    @XmlElement(name = "affair")
    private List<Affair> list = new LinkedList<>();

    public List<Affair> getList() {
        return list;
    }

}
