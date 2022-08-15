package com.veera.service;


import com.veera.data.Company;

import java.util.stream.Stream;

public interface CompnayService {
    Stream<Company> getCompanies();
}
