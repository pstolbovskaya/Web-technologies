package by.bsuir.stolbovskaya.Server.controller.util;

import by.bsuir.stolbovskaya.Server.domain.Affair;

import java.util.List;

public class AffairStringBuilder {
    public String buildString(List<Affair> affairList) {
        StringBuilder stringBuilder = new StringBuilder();
        affairList.forEach((affair) -> stringBuilder.append(buildString(affair)));
        return stringBuilder.toString();
    }

    public String buildString(Affair affair) {
        return String.format("Id: %s;\nName: %s;\nBirthday: %s;\nCourse: %d\n\n", affair.getId(), affair.getName(), affair.getBirthDate(), affair.getCourse());
    }
}
