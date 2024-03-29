package ru.gdim.excelmapper.mapper.format;

import org.apache.poi.ss.usermodel.Cell;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class LocalDateFormatter implements ValueFormatter<LocalDate> {

    @Override
    public Class<LocalDate> valueType() {

        return LocalDate.class;
    }

    @Override
    public LocalDate format(Cell cell) {

        Date value = new DateFormatter().format(cell);

        return (value != null)
                ? value
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate()
                : null;
    }

}
