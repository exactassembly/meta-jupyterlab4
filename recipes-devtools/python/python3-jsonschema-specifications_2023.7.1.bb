SUMMARY = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
HOMEPAGE = "https://github.com/python-jsonschema/jsonschema-specifications"
AUTHOR = "Julian Berman <Julian+jsonschema-specifications@GrayVines.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=93eb9740964b59e9ba30281255b044e2"

SRC_URI[sha256sum] = "c91a50404e88a1f6ba40636778e2ee08f6e24c5613fe4c53ac24578a5a7f72bb"

PYPI_PACKAGE = "jsonschema_specifications"

DEPENDS += "\
    python3-hatch-vcs-native \
    python3-packaging \
"

inherit pypi python_hatchling

RDEPENDS:${PN} = "\
    python3-referencing \
"

BBCLASSEXTEND = "native nativesdk"

