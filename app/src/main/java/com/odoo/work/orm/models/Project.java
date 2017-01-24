package com.odoo.work.orm.models;

import android.content.Context;

import com.odoo.work.orm.ColumnType;
import com.odoo.work.orm.OColumn;
import com.odoo.work.orm.OModel;

/**
 * Created by Vedant on 24-01-2017.
 */

public class Project extends OModel {
    public Project(Context context) {
        super(context, "project.project");
    }

OColumn name = new OColumn("Project Name", ColumnType.VARCHAR);


}
