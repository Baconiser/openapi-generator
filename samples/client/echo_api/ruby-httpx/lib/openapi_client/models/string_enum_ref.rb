=begin
#Echo Server API

#Echo Server API

The version of the OpenAPI document: 0.1.0
Contact: team@openapitools.org
Generated by: https://openapi-generator.tech
Generator version: 8.0.0-SNAPSHOT

=end

require 'date'
require 'time'

module OpenapiClient
  class StringEnumRef
    SUCCESS = "success".freeze
    FAILURE = "failure".freeze
    UNCLASSIFIED = "unclassified".freeze

    def self.all_vars
      @all_vars ||= [SUCCESS, FAILURE, UNCLASSIFIED].freeze
    end

    # Builds the enum from string
    # @param [String] The enum value in the form of the string
    # @return [String] The enum value
    def self.build_from_hash(value)
      new.build_from_hash(value)
    end

    # Builds the enum from string
    # @param [String] The enum value in the form of the string
    # @return [String] The enum value
    def build_from_hash(value)
      return value if StringEnumRef.all_vars.include?(value)
      raise "Invalid ENUM value #{value} for class #StringEnumRef"
    end
  end
end
