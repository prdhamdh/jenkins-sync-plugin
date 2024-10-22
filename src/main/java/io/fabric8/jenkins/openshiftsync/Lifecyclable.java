package io.fabric8.jenkins.openshiftsync;

import hudson.model.Descriptor.FormException;

public interface Lifecyclable {
    public void stop();
    public void start() throws FormException;

}
