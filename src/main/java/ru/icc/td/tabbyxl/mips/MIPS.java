package ru.icc.td.tabbyxl.mips;

import ru.icc.td.tabbyxl.model.CEntry;
import ru.icc.td.tabbyxl.model.CTable;
import ru.icc.td.tabbyxl.model.CCell;

public class MIPS {
    public void processTable(CTable table) {
        // TODO Put here the MIPS and FA algos
        System.out.println("Hello! I am MIPS");

        CCell cell = table.getCell(0);
        System.out.println("Provenance: " + cell.getProvenance());

    }
}
