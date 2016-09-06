package org.jenkinsci.plugins.liquibase.common;

import hudson.model.AbstractBuild;
import hudson.model.BuildListener;
import hudson.model.Descriptor;
import hudson.tasks.Builder;
import liquibase.Contexts;
import liquibase.Liquibase;
import liquibase.exception.LiquibaseException;

import java.io.IOException;
import java.util.Properties;

import org.jenkinsci.plugins.liquibase.evaluator.AbstractLiquibaseBuilder;
import org.jenkinsci.plugins.liquibase.evaluator.ExecutedChangesetAction;

public class BuilderStub extends AbstractLiquibaseBuilder {
    @Override
    public void doPerform(AbstractBuild<?, ?> build,
                          BuildListener listener,
                          Liquibase liquibase,
                          Contexts contexts,
                          ExecutedChangesetAction executedChangesetAction, Properties configProperties)
            throws InterruptedException, IOException, LiquibaseException {

    }

    @Override
    public Descriptor<Builder> getDescriptor() {
        return null;
    }

    @Override
    public String getChangeLogFile() {
        return "${token}";
    }
}