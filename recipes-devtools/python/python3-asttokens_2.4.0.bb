SUMMARY = "Annotate AST trees with source code positions"
HOMEPAGE = "https://github.com/gristlabs/asttokens"
AUTHOR = "Dmitry Sagalovskiy, Grist Labs <dmitry@getgrist.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

#SRC_URI = "https://files.pythonhosted.org/packages/ed/e0/7e5af07a090b9ef4f88e29b6edb8db8ca3366a0d7736ae9c3a6522fae140/asttokens-2.4.0.tar.gz"
SRC_URI[md5sum] = "af0ff280c88a37516e38a7b3086ad487"
SRC_URI[sha256sum] = "2e0171b991b2c959acc6c49318049236844a5da1d65ba2672c4880c1c894834e"

PYPI_PACKAGE = "asttokens"

inherit pypi python_setuptools_build_meta

DEPENDS += "\
    ${PYTHON_PN}-setuptools-scm-native \
"

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-six \
"

BBCLASSEXTEND = "native nativesdk"
