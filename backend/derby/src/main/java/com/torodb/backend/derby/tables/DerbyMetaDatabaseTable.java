/*
 * ToroDB - ToroDB-poc: Backend Derby
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
package com.torodb.backend.derby.tables;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.SQLDataType;

import com.torodb.backend.derby.tables.records.DerbyMetaDatabaseRecord;
import com.torodb.backend.tables.MetaDatabaseTable;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

@SuppressFBWarnings(value = {"EQ_DOESNT_OVERRIDE_EQUALS","HE_HASHCODE_NO_EQUALS"})
public class DerbyMetaDatabaseTable extends MetaDatabaseTable<DerbyMetaDatabaseRecord> {

    private static final long serialVersionUID = -5506554761865128847L;
    /**
	 * The singleton instance of <code>torodb.collections</code>
	 */
	public static final DerbyMetaDatabaseTable DATABASE = new DerbyMetaDatabaseTable();

	@Override
    public Class<DerbyMetaDatabaseRecord> getRecordType() {
        return DerbyMetaDatabaseRecord.class;
    }
	
	/**
	 * Create a <code>torodb.collections</code> table reference
	 */
	public DerbyMetaDatabaseTable() {
		this(TABLE_NAME, null);
	}

	/**
	 * Create an aliased <code>torodb.collections</code> table reference
	 */
	public DerbyMetaDatabaseTable(String alias) {
	    this(alias, DerbyMetaDatabaseTable.DATABASE);
	}

	private DerbyMetaDatabaseTable(String alias, Table<DerbyMetaDatabaseRecord> aliased) {
		this(alias, aliased, null);
	}

	private DerbyMetaDatabaseTable(String alias, Table<DerbyMetaDatabaseRecord> aliased, Field<?>[] parameters) {
		super(alias, aliased, parameters);
	}
    
	/**
	 * {@inheritDoc}
	 */
	@Override
	public DerbyMetaDatabaseTable as(String alias) {
		return new DerbyMetaDatabaseTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public DerbyMetaDatabaseTable rename(String name) {
		return new DerbyMetaDatabaseTable(name, null);
	}

    @Override
    protected TableField<DerbyMetaDatabaseRecord, String> createNameField() {
        return createField(TableFields.NAME.fieldName, SQLDataType.VARCHAR.nullable(false), this, "");
    }

    @Override
    protected TableField<DerbyMetaDatabaseRecord, String> createIdentifierField() {
        return createField(TableFields.IDENTIFIER.fieldName, SQLDataType.VARCHAR.nullable(false), this, "");
    }
}
