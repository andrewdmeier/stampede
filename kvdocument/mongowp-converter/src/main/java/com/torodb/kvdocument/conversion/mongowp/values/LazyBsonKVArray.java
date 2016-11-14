/*
 * ToroDB - KVDocument: MongoWP Converter
 * Copyright © 2014 8Kdata Technology (www.8kdata.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.torodb.kvdocument.conversion.mongowp.values;

import com.eightkdata.mongowp.bson.BsonArray;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.torodb.kvdocument.conversion.mongowp.MongoWPConverter;
import com.torodb.kvdocument.values.KVArray;
import com.torodb.kvdocument.values.KVValue;

/**
 *
 */
public class LazyBsonKVArray extends KVArray {

    private static final long serialVersionUID = 7698461215106087731L;

    private final BsonArray wrapped;

    public LazyBsonKVArray(BsonArray wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public UnmodifiableIterator<KVValue<?>> iterator() {
        return Iterators.unmodifiableIterator(Iterators.transform(wrapped.iterator(), MongoWPConverter.FROM_BSON)
        );
    }

    @Override
    public int size() {
        return wrapped.size();
    }

    @Override
    public boolean isEmpty() {
        return wrapped.isEmpty();
    }

    @Override
    public KVValue<?> get(int index) throws IndexOutOfBoundsException {
        return MongoWPConverter.translate(wrapped.get(index));
    }
}
