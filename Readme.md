# POC Gradle Plugin Conventions

This POC is to demonstrate the use of [convention plugins](https://docs.gradle.org/current/samples/sample_convention_plugins.html) 
into a sample scala project.

There is two different implementations: `local` and `remote`.

## local

This project describe how to use convention plugins from the `buildSrc` folder. From the same project.

## remote

This project describe how to use convention plugins by defining them into different gradle projects.
The main use case for this is to reuse these plugins from different projects (ie: not in the same git repository) for a team/organisation.
