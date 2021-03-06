/*
 * matrix-java-sdk - Matrix Client SDK for Java
 * Copyright (C) 2017 Maxime Dor
 *
 * https://max.kamax.io/
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package io.kamax.matrix.hs;

import org.apache.http.client.utils.URIBuilder;

import java.net.URI;
import java.net.URISyntaxException;

public class MatrixHomeserver implements _MatrixHomeserver {

    private String domain;
    private URI base;

    public MatrixHomeserver(String domain, String baseUrl) throws URISyntaxException {
        this.domain = domain;
        base = new URI(baseUrl);
    }

    @Override
    public String getDomain() {
        return domain;
    }

    @Override
    public URIBuilder getClientEndpoint() {
        return new URIBuilder(base);
    }

}
