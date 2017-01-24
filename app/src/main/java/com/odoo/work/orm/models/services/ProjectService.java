package com.odoo.work.orm.models.services;

import android.content.Context;

import com.odoo.work.orm.OModel;
import com.odoo.work.orm.models.Project;
import com.odoo.work.sync.OdooSyncService;

/**
 * Created by Vedant on 24-01-2017.
 */

public class ProjectService extends OdooSyncService {
    @Override
    public OModel getModel(Context context) {
        return new Project(context);
    }
}
