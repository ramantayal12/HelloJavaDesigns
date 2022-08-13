package learnLombokBuilder;


import lombok.Value;

/*
Suppose we're using an object that we want to construct with a builder,
but we can't modify the source or extend the Class.
 */

@Value
final class ImmutableBuilder {
  int id;
  String name;
}