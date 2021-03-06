/*
 * ImpBoardBook
 * Copyright (c) 2012 CREDIT SUISSE Technology and Operations. All Rights Reserved.
 * This software is the proprietary information of CREDIT SUISSE Technology and Operations.
 * Use is subject to license and non-disclosure terms.
 */
package com.github.gekoh.yagen.example.imp;

import com.github.gekoh.yagen.api.LayeredTablesView;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Georg Kohlweiss (G477448)
 */
@Entity
@Table(name = "IMP_BOARD_BOOK_V")
@com.github.gekoh.yagen.api.Table(shortName = "IBB")
@LayeredTablesView(
        keyColumns = { "AC_CALL_SIGN", "NUMENTRY" },
        tableNamesInOrder = { "IMP_BOARD_BOOK_COR", "IMP_BOARD_BOOK_XST", "IMP_BOARD_BOOK", "IMP_BOARD_BOOK_SYN" }
)
public class ImpBoardBook {
    //private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(ImpBoardBook.class);

    @Id
    private String loadId;

    @Column(name = "AC_CALL_SIGN")
    private String acCallSign;

    @Basic(optional = false)
    private int numEntry;

    @Basic(optional = false)
    private int landingNrFrom;

    @Basic(optional = false)
    private int landingNrTo;

    @Column(name = "CREW_AND_PAX")
    private String crewAndPax;

    @Basic(optional = false)
    private String departureTimestamp;

    @Basic(optional = false)
    private String landingTimestamp;

    @Basic
    private String fromAirport;

    @Basic
    private String toAirport;

    @Basic
    private String notesLine;

    protected ImpBoardBook() {
    }

    public ImpBoardBook(String loadId, String acCallSign, int numEntry, int landingNrFrom, int landingNrTo, String crewAndPax, String departureTimestamp, String landingTimestamp, String fromAirport, String toAirport, String notesLine) {
        this.loadId = loadId;
        this.acCallSign = acCallSign;
        this.numEntry = numEntry;
        this.landingNrFrom = landingNrFrom;
        this.landingNrTo = landingNrTo;
        this.crewAndPax = crewAndPax;
        this.departureTimestamp = departureTimestamp;
        this.landingTimestamp = landingTimestamp;
        this.fromAirport = fromAirport;
        this.toAirport = toAirport;
        this.notesLine = notesLine;
    }

    public String getLoadId() {
        return loadId;
    }

    public String getAcCallSign() {
        return acCallSign;
    }

    public int getNumEntry() {
        return numEntry;
    }

    public int getLandingNrFrom() {
        return landingNrFrom;
    }

    public int getLandingNrTo() {
        return landingNrTo;
    }

    public String getCrewAndPax() {
        return crewAndPax;
    }

    public String getDepartureTimestamp() {
        return departureTimestamp;
    }

    public String getLandingTimestamp() {
        return landingTimestamp;
    }

    public String getFromAirport() {
        return fromAirport;
    }

    public String getToAirport() {
        return toAirport;
    }

    public String getNotesLine() {
        return notesLine;
    }
}