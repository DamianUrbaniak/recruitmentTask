package com.damianurbaniak.recruitmentTask.repodataprovider.common.exception;

public record CustomErrorResponse(int status,
                                  String message) {
}
